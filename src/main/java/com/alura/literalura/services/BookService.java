package com.alura.literalura.services;

import com.alura.literalura.model.DataResultsBooks;

public class BookService {
    private final ConsumeAPI consumeAPI;
    private final DataConversion dataConversion;

    public BookService(ConsumeAPI consumeAPI, DataConversion dataConversion) {
        this.consumeAPI = consumeAPI;
        this.dataConversion = dataConversion;
    }
    // Metodo que consume la API de Gutendex y retorna los datos en un objeto DataResultsBooks
    public DataResultsBooks getDataResults() {
        String url = "https://gutendex.com/books/";
        var json = consumeAPI.getData(url);
        return dataConversion.convertData(json, DataResultsBooks.class);
    }
}
