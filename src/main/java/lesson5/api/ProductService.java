package lesson5.api;

import lesson5.api.Product;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ProductService {
    @POST("http://localhost:8189/market/api/v1/products")
    Call<Product> createProduct(@Body Product createProductRequest);

    @DELETE("http://localhost:8189/market/api/v1/products/{id}")
    Call<ResponseBody> deleteProduct(@Path("id") int id);

    @PUT("http://localhost:8189/market/api/v1/products")
    Call<Product> modifyProduct(@Body Product modifyProductRequest);

    @GET("http://localhost:8189/market/api/v1/products/{id}")
    Call<Product> getProductById(@Path("id") int id);

    @GET("http://localhost:8189/market/api/v1/products")
    Call<ResponseBody> getProducts();
}
