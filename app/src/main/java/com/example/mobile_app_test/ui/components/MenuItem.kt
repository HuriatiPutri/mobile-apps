package com.example.mobile_app_test.ui.components

import com.example.mobile_app_test.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobile_app_test.ui.theme.Primary50
import com.example.mobile_app_test.ui.theme.Primary700

@Preview(showBackground = true)
@Composable
fun MenuItem(){
    Row(
        modifier = Modifier.fillMaxWidth()
            .padding(8.dp, 16.dp)
            .background(Primary50)
            .border(
                width = 1.dp,
                color = Primary700,
                shape = RoundedCornerShape(8.dp)
            )
        ,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,

    ) {
        Row(modifier = Modifier
            .padding(8.dp, 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            Image(
                painter = painterResource(R.drawable.ic_favorite),
                contentDescription = "Profile",
                modifier = Modifier.size(32.dp)
            )
            Text(
                text = "Catat Penjualan",
                fontSize = 24.sp
            )
        }
        Button(
            onClick = { /* Handle action */ }
        ) {
            Text("Edit")
        }
    }
}

