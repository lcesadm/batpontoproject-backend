<h1 align="center">batpontoproject-backend</h1>
<p align="center">
    <img src="logo.png" alt="BatPonto Logo" width="200">
</p>

### Topics
:small_blue_diamond: [About](#about-book)  
:small_blue_diamond: [ERD](#erd-clipboard)  
:small_blue_diamond: [Running Application](#running-application-arrow_forward)  
:small_blue_diamond: [Developers Team](#developers-team-octocat)  

## About :book:
<p align="justify">
    This project consists fo creating an app that simulates a company's "punch clock", using React Native with Spring features for login authentication and DB access.
</p>
<p align="center">
    <a href="https://www.java.com" target="_blank">
        <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java">
    </a>
    <a href="https://spring.io" target="_blank">
        <img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white" alt="Spring">
    </a>
    <a href="https://code.visualstudio.com" target="_blank">
        <img src="https://img.shields.io/badge/Visual_Studio_Code-0078D4?style=for-the-badge&logo=visual%20studio%20code&logoColor=white" alt="VSCode">
    </a>
    <a href="https://www.jetbrains.com/idea" target="_blank">
        <img src="https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white" alt="Intellij">
    </a>
    <img src="http://img.shields.io/static/v1?label=STATUS&message=FINISHED&color=GREEN&style=for-the-badge" alt="Status">
</p>

## ERD :clipboard:
<p align="center">
    <img src="sql/ERD.png" width="500">
</p>

:exclamation: Run `create.sql` and `insert.sql` scripts to create the DB tables.

## Running Application :arrow_forward:
First, clone this repository:
```
git clone https://github.com/LeoLCM/batpontoproject-backend.git
```
In the project folder, install dependencies:
```
mvn install
```
Run Maven with Spring Boot:
```
mvn clean spring-boot:run
```
:warning: Don't forget to configure your DB on `application.properties` file:
```
spring.datasource.url=${DATABASE_URL}
spring.datasource.username=${DATABASE_USERNAME}
spring.datasource.password=${DATABASE_PASSWORD}
```

## Developers Team :octocat:
| [<img src="https://avatars.githubusercontent.com/u/60631170" width=115><br><sub>Leonardo Cesar</sub>](https://github.com/LeoLCM) |  [<img src="https://avatars.githubusercontent.com/u/101664656" width=115><br><sub>Matheus Messias</sub>](https://github.com/MatheusLMessias) |
| :---: | :---: 
<p align="center">
    <a href="./LICENSE" target="_blank">
        <img src="https://img.shields.io/github/license/Ileriayo/markdown-badges?style=for-the-badge" alt="MIT LICENSE">
    </a>
    <br>
    Copyright © 2022 - BatPonto
</p>
