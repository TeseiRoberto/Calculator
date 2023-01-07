#!/bin/bash

SRCS=src/*.java
javac --module-path "javafx-lib-x64/" --add-modules javafx.controls,javafx.fxml $SRCS -d bin
