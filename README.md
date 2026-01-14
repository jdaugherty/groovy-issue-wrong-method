# groovy-issue-wrong-method

This branch shows the issue exists with Groovy 3 as well.

See test WrongResolutionSpec; this test ensures the more specific argument form of the `listener` method is invoked.

When `@CompileStatic` is used, the wrong method is invoked.