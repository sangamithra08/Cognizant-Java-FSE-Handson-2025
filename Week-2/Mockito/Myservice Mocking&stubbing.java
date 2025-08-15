//import static org.mockito.Mockito.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;

// This is the external API we will mock
interface ExternalApi {
    String getData();
}

// This is the service class depending on ExternalApi
class Myservice {
    private ExternalApi api;

    public Myservice(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }
}

// This is the unit test with mocking and stubbing
