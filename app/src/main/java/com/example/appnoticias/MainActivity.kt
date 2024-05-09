package com.example.appnoticias

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appnoticias.ui.theme.AppNoticiasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppNoticiasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App() {
    Column (
        Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
            .verticalScroll(state = ScrollState(initial = 0))
    ) {
        Row (
            Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.primary),
            Arrangement.Center
        ) {
            Text(
                text = "App Notícias",
                fontFamily = FontFamily.SansSerif,
                fontSize = 30.sp,
                color = Color.White
            )
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ){ }

        Column(
            Modifier
                .fillMaxWidth()
        ){
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.primary)
            ) {
                Text(
                    text = "Lorem Ipsum",
                    color = Color.Black
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam eget ligula eu lectus lobortis condimentum. Aliquam nonummy auctor massa. Pellentesque habitant morbi tristique...",
                    color = Color.Black
                )
            }
            Row (
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ) {
                Button(
                    onClick = {/*TODO*/}
                ) {
                    Text(text = "Leia Mais")
                }
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ){ }

        Column(
            Modifier
                .fillMaxWidth()
        ){
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.primary)
            ) {
                Text(
                    text = "Enchentes no Rio Grande do Sul",
                    color = Color.Black
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(
                    text = "Situação das enchentes no Rio Grande do Sul piora; resgates estão sendo preparados.",
                    color = Color.Black
                )
            }
            Row (
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ) {
                Button(
                    onClick = {/*TODO*/}
                ) {
                    Text(text = "Leia Mais")
                }
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ){ }

        Column(
            Modifier
                .fillMaxWidth()
        ){
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.primary)
            ) {
                Text(
                    text = "Primeira imagem de 'Superman' divulgada",
                    color = Color.Black
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(
                    text = "O diretor divulgou a primeira imagem do herói e seu novo traje para o filme, que chegará aos cinemas em 2025.",
                    color = Color.Black
                )
            }
            Row (
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ) {
                Button(
                    onClick = {/*TODO*/}
                ) {
                    Text(text = "Leia Mais")
                }
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ){ }

        Column(
            Modifier
                .fillMaxWidth()
        ){
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.primary)
            ) {
                Text(
                    text = "São Paulo ganha do CD Cobresal por 3 a 1",
                    color = Color.Black
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(
                    text = "São Paulo ganhou do CD Cobresal com placar de 3 a 1 e garante vaga nas oitavas da Copa Libertadores.",
                    color = Color.Black
                )
            }
            Row (
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ) {
                Button(
                    onClick = {/*TODO*/}
                ) {
                    Text(text = "Leia Mais")
                }
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ){ }

        Column(
            Modifier
                .fillMaxWidth()
        ){
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.primary)
            ) {
                Text(
                    text = "Prazo de inscrição para o Vestibulinho prorrogado",
                    color = Color.Black
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(
                    text = "Etecs prorrogam prazo de inscrição do Vestibulinho 2024/2 para o dia 17 de maio.",
                    color = Color.Black
                )
            }
            Row (
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ) {
                Button(
                    onClick = {/*TODO*/}
                ) {
                    Text(text = "Leia Mais")
                }
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ){ }

        Column(
            Modifier
                .fillMaxWidth()
        ){
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.primary)
            ) {
                Text(
                    text = "Saqueadores atacam lojas no Rio Grande do Sul",
                    color = Color.Black
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(
                    text = "Em meio a inundações, saqueadores roubam lojas e atacam barcos.",
                    color = Color.Black
                )
            }
            Row (
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ) {
                Button(
                    onClick = {/*TODO*/}
                ) {
                    Text(text = "Leia Mais")
                }
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ){ }

        Column(
            Modifier
                .fillMaxWidth()
        ){
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.primary)
            ) {
                Text(
                    text = "Sepultura anuncia novas datas de turnê de despedida no Brasil",
                    color = Color.Black
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(
                    text = "A banda se apresentará no Ceará, no Pará, Brasília, Paraíba, Mato Grosso do Sul e interior de São Paulo nos próximos meses.",
                    color = Color.Black
                )
            }
            Row (
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ) {
                Button(
                    onClick = {/*TODO*/}
                ) {
                    Text(text = "Leia Mais")
                }
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ){ }

    }
}

@Preview
@Composable
fun AppPreview() {
    AppNoticiasTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            App()
        }
    }
}