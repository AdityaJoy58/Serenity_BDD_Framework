# Serenity_BDD_Framework

## **Required Setup :**

- [Java](https://www.guru99.com/install-java.html) should be installed and configured.
- [Maven](https://mkyong.com/maven/install-maven-on-mac-osx/#homebrew-install-maven-on-macos) should be installed and configured.

## **Running Tests:**

Open the command prompt and navigate to the folder in which pom.xml file is present.
Run the below Maven command.

```
mvn clean serenity:aggregate verify
```

Once scripts completes execution report will be generated in */target/site/serenity*  folder.