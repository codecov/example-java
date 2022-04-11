name: ci

on:
  pull_request:
  push:
    branches:
      - master

jobs:
  build:
    strategy:
      matrix:
        java: [ 8, 11 ]
        os: [ ubuntu-latest, macos-latest, windows-latest ]
        include:
          - java: 12
            os: ubuntu-latest
          - java: 13
            os: ubuntu-latest
          - java: 14
            os: ubuntu-latest
          - java: 15
            os: ubuntu-latest
          - java: 16
            os: ubuntu-latest
    runs-on: ${{ matrix.os }}
    steps:
      - uses: codecov/codecov-action@v1
        if: env.SKIP_CI != 'true'
