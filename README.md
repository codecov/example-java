Codecov Java Example
====================

| [https://codecov.io][1] | [@codecov][2] | [hello@codecov.io][3] |
| ----------------------- | ------------- | --------------------- |

This repository serves as an **example** on how to use [Codecov Global][4] for Java.

## Usage


### Add Jacoco plugin
```xml
<plugin>
  <groupId>org.jacoco</groupId>
  <artifactId>jacoco-maven-plugin</artifactId>
  <version>0.7.5.201505241946</version>
  <executions>
    <execution>
      <goals>
        <goal>prepare-agent</goal>
      </goals>
    </execution>
    <execution>
      <id>report</id>
      <phase>test</phase>
      <goals>
        <goal>report</goal>
      </goals>
    </execution>
  </executions>
</plugin>
```
> For the [newest version check here](http://www.eclemma.org/jacoco/)


# Travis CI

Add to your `.travis.yml` file.
```yml
language:
  java

before_script:
  - pip install --user codecov

after_success:
  - codecov
```

> Another option is our [Bash uploader](https://github.com/codecov/codecov-bash)

## Private Repos

Add to your `.travis.yml` file.
```yml
env:
  global:
    - CODECOV_TOKEN=:uuid-repo-token

before_script:
  - pip install --user codecov

after_success:
  - codecov
```

View source and learn more about [Codecov Global Uploader][4]

[1]: https://codecov.io/
[2]: https://twitter.com/codecov
[3]: mailto:hello@codecov.io
[4]: https://github.com/codecov/codecov-python
