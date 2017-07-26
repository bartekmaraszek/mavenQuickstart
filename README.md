`mvn clean install` this project in order to be able to invoke:

```
########################################################
#    MAVEN                                             #
########################################################

alias quickstart='project'
alias qstart='project'

# run a non-interactive custom quickstart archetype 
# with Java 8, JUnit 4.12, and AssertJ 3.8.0

project() {
  if (( "$#" != 2 ))
  then
    echo "Usage: project package.name projectName"
    return
  fi
  mvn archetype:generate -DgroupId=$1 -DartifactId=$2 -DarchetypeGroupId=pl.bmaraszek -DarchetypeVersion=1.0 -DarchetypeArtifactId=custom-quickstart -DinteractiveMode=false
}
```
