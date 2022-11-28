package com.google.google.services;

import com.google.google.entities.WebPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.apache.logging.log4j.util.Strings.isBlank;

@Service
public class SpiderService {

    @Autowired
    private SearchService searchService;

    public String indexWebPage() {
        //Definimos la url
        String url = "https://www.bbc.com/";
        //Obtenemos el contenido de la página web
        String content = getWebContent(url);
        if (isBlank(content)) {return "";}
        //Ahora deseamos obtener el titulo y la descripción de la web
        String title = getTitle(content);
        String description = getDescription(content);


        WebPage webPage = new WebPage();
        webPage.setDescription(description);
        webPage.setTitle(title);
        webPage.setUrl(url);
        // COn esto la guardamos en la base de datos
        searchService.save(webPage);

        return description;
    }

    public String getTitle(String content) {
        // Como capturamos el html, cortamos entre las etiquetas
        String[] aux =content.split("<title>");
        String[] aux2 = aux[1].split("</title>");
        return aux2[0];
    }

    public String getDescription(String content) {
        // Como capturamos el html, cortamos entre las etiquetas
        String[] aux =content.split("<meta name=\"description\" content=\"");
        String[] aux2 = aux[1].split("\">");
        return aux2[0];
    }

    private String getWebContent(String link) {
        try{
            URL url = new URL(link);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            String encoding = conn.getContentEncoding();

            InputStream input = conn.getInputStream();

            Stream<String> lines = new BufferedReader(new InputStreamReader(input))
                    .lines();

            System.out.println("END");

            return lines.collect(Collectors.joining());
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
        return "";
    }
}
