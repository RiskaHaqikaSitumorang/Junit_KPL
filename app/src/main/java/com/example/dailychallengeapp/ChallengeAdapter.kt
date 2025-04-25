package com.example.dailychallengeapp

import android.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView

class ChallengeAdapter(private val challenges: MutableList<Challenge>) :
    RecyclerView.Adapter<ChallengeAdapter.ChallengeViewHolder>() {

    inner class ChallengeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val checkBox: CheckBox = itemView.findViewById(R.id.checkBox)
        val buttonDelete: ImageButton = itemView.findViewById(R.id.buttonDelete)
        val buttonEdit: ImageButton = itemView.findViewById(R.id.buttonEdit)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChallengeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_challenge, parent, false)
        return ChallengeViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChallengeViewHolder, position: Int) {
        val challenge = challenges[position]
        holder.checkBox.isChecked = challenge.isCompleted
        holder.checkBox.text = challenge.title

        holder.buttonDelete.setOnClickListener {
            challenges.removeAt(position)
            notifyDataSetChanged()
        }

        holder.buttonEdit.setOnClickListener {
            val editText = EditText(holder.itemView.context)
            editText.setText(challenge.title)

            AlertDialog.Builder(holder.itemView.context)
                .setTitle("Edit Challenge")
                .setView(editText)
                .setPositiveButton("Save") { _, _ ->
                    challenge.title = editText.text.toString()
                    notifyDataSetChanged()
                }
                .setNegativeButton("Cancel", null)
                .show()
        }

        holder.checkBox.setOnCheckedChangeListener { _, isChecked ->
            challenge.isCompleted = isChecked
        }
    }

    override fun getItemCount(): Int = challenges.size
}
