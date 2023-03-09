package lesson5.api;

import lombok.experimental.UtilityClass;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

@UtilityClass
public class RetroUtils {
    public Retrofit getRetrofit(){
        return new Retrofit.Builder()
                .baseUrl("http://localhost:8189/market/api/v1/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

    }
}
