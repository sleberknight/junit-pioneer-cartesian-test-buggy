This repository demonstrates a possible issue with JUnit Pioneer's CartesianTest and parameter injection.

Basically if you use `@CartesianTest` and use parameter injection in a `@BeforeEach` and/or `@AfterEach` method, the test never executes and a `ParameterResolutionException` is thrown.

Here is the related [issue](https://github.com/junit-pioneer/junit-pioneer/issues/633).

The Action is _expected_ to fail and has been tested using JUnit Pioneer 1.7.0.
