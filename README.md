This repository demonstrates a possible issue with JUnit Pioneer's CartesianTest and parameter injection.

Basically if you use `@CartesianTest` and use parameter injection in a `@BeforeEach` and/or `@AfterEach` method, the test never executes and a `ParameterResolutionException` is thrown.

Here is the related [issue](https://github.com/junit-pioneer/junit-pioneer/issues/633).

Note that the Action is _expected_ to fail when using JUnit Pioneer 1.6.x and 1.7.0. Version 1.6.0 is when the [new way](https://github.com/junit-pioneer/junit-pioneer/issues/415) of using `@CartesianTest` was introduced.
