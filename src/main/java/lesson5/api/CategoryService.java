package lesson5.api;

import lesson5.dto.GetCategoryResponse;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;


public interface CategoryService {

    @GET("http://localhost:8189/market/api/v1/categories/{id}")
    Call<GetCategoryResponse> getCategory(@Path("id") int id);
}

