// Paquete principal de la app (debe coincidir con el namespace de build.gradle)
package com.example.reto1

import android.os.Bundle
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.reto1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Permite que la pantalla ocupe hasta los bordes del móvil (debajo de hora y batería)
        enableEdgeToEdge()
        // ViewBinding: conecta directamente los IDs del XML con Kotlin sin usar findViewById
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configuramos el WebView para que muestre la web oficial de Android dentro de la app
        binding.webView.settings.javaScriptEnabled = true // Activa JavaScript para que la web cargue bien
        binding.webView.webViewClient = WebViewClient()   // Mantiene la navegación dentro de la app (no abre Chrome)
        binding.webView.loadUrl("https://developer.android.com") // Dirección web que se carga al abrir la pantalla
    }
}