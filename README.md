# RM_WeatherForecast
Project uses standard Android libraries with the exception of Square's Otto Event Bus library.

Otto is used to broadcast events back to any object still listening via Otto's Subscribe/Produce structure.

The applications model POJOs where generated in order for GSON to consume the returning JSON object from Weather.gov.
