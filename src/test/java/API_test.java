import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;


public class API_test {
    @Test
    public void shouldGetLuke() {
        given();
        when().get("http://swapi.co/api/people/3/")
                .then().statusCode(200)
                .and()
                .assertThat()
                .body("name", equalTo("R2-D2"));
    }
}
