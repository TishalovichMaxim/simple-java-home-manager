# Use cases

## List jdks

    ~/.sjhm/jdks> ls
    jdk1
    jdk2
    jdk3

    ~/.sjhm/jdks> sjhm ls
    1 - jdk1
    2 - jdk2
    3 - jdk3
    
## Setting active jdk

    ~/.sjhm/jdks> sjhm ls
    1 - jdk1
    2 - jdk2
    3 - jdk3
    ~/> sjhm set 2

---

    ~/> echo $Env:JAVA_HOME
    ~/.sjhm/jdks/jdk2
