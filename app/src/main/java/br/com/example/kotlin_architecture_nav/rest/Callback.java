package br.com.example.kotlin_architecture_nav.rest;

import com.example.ktmovies.rest.ApiError;

/**
 * Created by danilorangel on 18/06/2018.
 */

public interface Callback<T> {
    void onSuccess(T data);
    void onError(ApiError error);
}
