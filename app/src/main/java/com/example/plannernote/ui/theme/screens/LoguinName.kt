package com.example.plannernote.ui.theme.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@OptIn(ExperimentalMaterial3Api::class)
@Composable
// ACA AGREGO EL onCreate para el sistema de navegacion
fun LoguinName(
    modifier: Modifier,
    onCreateUser: () -> Unit,
) {
    var name by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize()) {
        Card(modifier = Modifier
            .weight(2f)
            .fillMaxWidth()
            .padding(all = 16.dp))
        {

            Column(modifier = Modifier
                .fillMaxSize()
                .padding(
                    top = 32.dp
                ), horizontalAlignment = Alignment.CenterHorizontally) {

                //TEXO BIENVENIDO
                Text(
                    text = "Bienvenidos:",
                    fontSize = 30.sp,
                )
                // CAJA PEDIR NOMBRE
                OutlinedTextField(
                    value = name,
                    onValueChange = { name = it },
                    label = { Text("Usuario") }
                )
                // CAJA PEDIR CONTRASE
                var password by remember { mutableStateOf("") }
                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text("Contraseña") }
                )
                Button(onClick = {
                        onCreateUser()
                }) {
                    //ACA TIENE QUE RECIBIR LA VARIABLE propuesta_nombre
                    Text(text = "REGISTRATE")
                }
                Button(onClick = {
                    onCreateUser()
                    /* loguin()*/
                }) {
                    //ACA TIENE QUE RECIBIR LA VARIABLE propuesta_nombre
                    Text(text = "INGRESAR")
                }
            }
        }
    }
}
