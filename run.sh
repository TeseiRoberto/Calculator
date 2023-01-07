#!/bin/bash

PACKAGE_NAME="com.myPackage"

java --module-path "javafx-lib-x64/" --add-modules javafx.controls,javafx.fxml -cp bin $PACKAGE_NAME.Main
