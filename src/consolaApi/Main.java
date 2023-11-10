package consolaApi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {

	public static void main(String[] args) {
		try {
            // URL de la API 
            String apiUrl = "http://localhost:8080/usuario";

            // Crear la conexión
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Configurar el método de solicitud (GET)
            connection.setRequestMethod("GET");

            // Obtener la respuesta
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Leer la respuesta
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String linea;
                StringBuilder respuesta = new StringBuilder();

                while ((linea = reader.readLine()) != null) {
                    respuesta.append(linea);
                }
                reader.close();

                // Aquí puedes procesar la respuesta (almacenarla, analizarla, etc.)
                System.out.println("Respuesta de la API USUARIOS: " + respuesta.toString());
            } else {
                System.out.println("Error al hacer la solicitud. Código de respuesta: " + responseCode);
            }

            // Cerrar la conexión
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
		
		try {
            // URL de la API 
            String apiUrl = "http://localhost:8080/acceso";

            // Crear la conexión
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Configurar el método de solicitud (GET)
            connection.setRequestMethod("GET");

            // Obtener la respuesta
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Leer la respuesta
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String linea;
                StringBuilder respuesta = new StringBuilder();

                while ((linea = reader.readLine()) != null) {
                    respuesta.append(linea);
                }
                reader.close();

                // Aquí puedes procesar la respuesta (almacenarla, analizarla, etc.)
                System.out.println("Respuesta de la API ACCESOS: " + respuesta.toString());
            } else {
                System.out.println("Error al hacer la solicitud. Código de respuesta: " + responseCode);
            }

            // Cerrar la conexión
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}

