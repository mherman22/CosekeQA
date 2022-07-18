# CosekeQA Digitization Projects
The sole purpose of this tool is to monitor the file changes that occur during scanning, indexing and quality control (using [capture pro](https://www.alarisworld.com/en-us/solutions/software/document-scanning-software/capture-pro-software)). 
After monitoring the file, it is supposed to read the file and store the data into a database (mysql). The data in the database is therefore used to make reporting of employee performance for those in various projects under **CosekeUG**.

## Tools used in development
- [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Apache Netbeans](https://netbeans.apache.org/)
- [Mysql](https://www.mysql.com/)
- [Swing](https://en.wikipedia.org/wiki/Swing_(Java))
- [Microsoft Windows](https://www.microsoft.com/software-download/windows10)

## How to Run the repo in IDE?
Make sure you have [java](https://www.oracle.com/java/) installed on your windows platform by doing the following;-
- Download and install java 17.
- Set environment variable path (JAVA_HOME).
- Test to see if java has been installed. `java -version` and it should return something like
```
java version "17.0.2" 2022-01-18 LTS
Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)
```
- Download and install mysql8 onto your windows platform.
- Open the repository into netbeans, clean and build it using maven and then when it is successful, look through the `CosekeQA/target` folder and run the executable.jar file in order to have the application running.

## Pull Requests? Wanna implement or make an addition or correct something?
- fork this repository.
- clone it onto your machine by running `git clone https://github.com/your-name/CosekeQA.git`.
- make your changes and test them to ensure everything perfect.
- create a branch `git checkout -b branch-name`.
- commit your changes to your branch using `git add .` and  `git commit -m "commit message"`.
- pull from origin to ensure your local repo is in sync with upstream. use `git pull origin branch-name`
- push your changes using `git push origin branch-name`.
- create a pull request and give it a proper description stating clearly the changes you have added.

## Created By
- [mherman22](https://github.com/mherman22)
