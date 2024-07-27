package org.example;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws Exception {

        Gson gson = new Gson();
        String qs = "?type=public&" + Constants.keyIDQuery + "&q=chicken";
        HttpRequest getRecipieRequest = HttpRequest.newBuilder()
                .uri(new URI("https://api.edamam.com/api/recipes/v2" + qs))
                .GET()
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> httpResponse = httpClient.send(getRecipieRequest, HttpResponse.BodyHandlers.ofString());

        RecipieResponse response = gson.fromJson(httpResponse.body(), RecipieResponse.class);
        System.out.println(response.getCount());
       System.out.println(response.getHits().get(0).getRecipe().stringifyIngredientLines());
    }
}