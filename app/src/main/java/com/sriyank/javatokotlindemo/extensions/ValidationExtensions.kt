package com.sriyank.javatokotlindemo.extensions

import android.support.design.widget.TextInputLayout
import android.widget.EditText


fun EditText.isNotEmpty(textInputLayout: TextInputLayout): Boolean {

	return if (text.toString().isEmpty()) {
		textInputLayout.error = "Cannot be blank !"
		false
	} else {
		textInputLayout.isErrorEnabled = false
		true
	}
}
