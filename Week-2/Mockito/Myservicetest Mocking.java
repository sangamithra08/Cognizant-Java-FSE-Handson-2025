import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Myservicetest {

    @Test
    public void testExternalApi() {
        // 1. Create mock
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // 2. Stub method
        when(mockApi.getData()).thenReturn("Mock Data");

        // 3. Inject mock into service
        Myservice service = new Myservice(mockApi);

        // 4. Call method and assert result
        String result = service.fetchData();
        assertEquals("Mock Data", result);
    }
}
