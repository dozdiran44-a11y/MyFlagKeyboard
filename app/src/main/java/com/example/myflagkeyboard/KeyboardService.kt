package com.example.myflagkeyboard

import android.inputmethodservice.InputMethodService
import android.view.View
import android.widget.Button
import android.widget.LinearLayout

class KeyboardService : InputMethodService() {

    override fun onCreateInputView(): View {
        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.HORIZONTAL

        val flagButton = Button(this)
        flagButton.text = "🏳️"

        flagButton.setOnClickListener {
            currentInputConnection.commitText("🏳️", 1)
        }

        layout.addView(flagButton)

        return layout
    }
}
