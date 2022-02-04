package com.stripedemoapp

import android.app.ProgressDialog
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.stripe.android.Stripe
import com.stripe.android.model.Card
import com.stripe.android.view.CardInputWidget
import java.util.*


class MainActivity : AppCompatActivity() {
    val PUBLISHABLE_KEY = "pk_test_D7bK2bKidLFrSPN4fweIe8ar"
    private var card: Card? = null
    private val BACKEND_URL =
        "http://192.168.1.6:4242/" //4242 is port mentioned in server i.e index.js
    var amountText: EditText? = null
    var cardInputWidget: CardInputWidget? = null
    // we need paymentIntentClientSecret to start transaction
    private val paymentIntentClientSecret: String? = null
    //declare stripe
    private var stripe: Stripe? = null
    var amountDouble: Double? = null
    var progressDialog: ProgressDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//Initialize
        //Initialize
        stripe = Stripe(
            applicationContext,
            Objects.requireNonNull("pk_test_51ISLoeDrYpYnN0xnqW7bZ0tJKmtxUEdYOhD8AXoO10S9aMSXZ8Hk6e7EXJvKpn476isXZXgdG5R5TAj7aVXceJZo00bIx1MjgM")
        )


    }

    private fun makePayment(amount:String)
    {


    }
}