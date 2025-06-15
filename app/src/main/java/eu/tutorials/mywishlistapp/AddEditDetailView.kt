package eu.tutorials.mywishlistapp

import android.widget.NumberPicker.OnValueChangeListener
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.SemanticsProperties.Text
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun AddEditDetailView(
    id:Long,
    viewModel: WishViewModel,
    navController: NavController
){
    Scaffold(topBar={ AppBarView(title = if (id != 0L){
        stringResource(id = R.string.update_wish)
    }
    else{
        stringResource(id = R.string.add_wish)
    }
        ,navController=navController)}){
        Column(modifier= Modifier
            .padding(it)
            .wrapContentSize(), horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Spacer(modifier=Modifier.height(10.dp))
            WishTextField(label = "title", value = viewModel.wishTitleState, onValueChanged = {
                viewModel.OnWishTitleChanged(it)
            })
            Spacer(modifier=Modifier.height(10.dp))
            WishTextField(label = "Discription", value = viewModel.wishDescriptionState, onValueChanged = {
                viewModel.OnWishDescriptionChanged(it)
            })

            Spacer(modifier=Modifier.height(10.dp))

            Button(onClick = { }) {
                Text(text=if (id!=0L) stringResource(id = R.string.update_wish)
                else stringResource(id = R.string.add_wish),
                    style= TextStyle(fontSize = 18.sp)
                )
            }
        }
    }
}

@Composable
fun WishTextField(
    label:String,
    value:String,
    onValueChanged:(String)->Unit
){
    androidx.compose.material.OutlinedTextField(
        value = value,
        onValueChange = onValueChanged,
        label = { androidx.compose.material3.Text(text = label, color = Color.Black) },
        modifier = Modifier.fillMaxWidth(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            // using predefined Color
            textColor = Color.Black,
            // using our own colors in Res.Values.Color
            focusedBorderColor = colorResource(id = R.color.black),
            unfocusedBorderColor = colorResource(id = R.color.black),
            cursorColor = colorResource(id = R.color.black),
            focusedLabelColor = colorResource(id = R.color.black),
            unfocusedLabelColor = colorResource(id = R.color.black),
        ))
}
