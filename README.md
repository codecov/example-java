[Codecov][0] Java Example
=========================

1. Add JaCoCo Plugin to your pom.xml file, [see here](https://github.com/codecov/example-java/blob/master/pom.xml#L38-L56)
2. Call `bash <(curl -s https://codecov.io/bash) -t repository-upload-token` at the end of your CI build
  - Is you repository public and tested with Travis, CircleCI or AppVeyor? Then the repository upload token is not required!

> Also see out [Example Android][3] and [Example Gradle][2] repositories.


# Frequently Asked Questions

####❔How do I enable multi-module projects?

In your `pom.xml` file please append a list of modules in your projects

```xml
<project>
  <modules>
    <module>module_a/</module>
    <module>model_b/</module>
  </modules>
</project>
```

####❔Seeing `Skipping JaCoCo execution due to missing execution data file`?

Please see [http://stackoverflow.com/questions/18107375/...](http://stackoverflow.com/questions/18107375/getting-skipping-jacoco-execution-due-to-missing-execution-data-file-upon-exec)

####❔Does Codecov accept `jacoco.exec` reports?

**No**, these files are not supported. Please produce a `xml` file as detailed in the pom.xml file at [codecov/example-java][1]

####❔Is there a Gradle example?

**Yes**, enter [codecov/example-gradle][2]

####❔Is there a Android example?

**Yes**, enter [codecov/example-android][3]



[0]: https://codecov.io/
[1]: https://github.com/codecov/example-java
[2]: https://github.com/codecov/example-gradle
[3]: https://github.com/codecov/example-android
