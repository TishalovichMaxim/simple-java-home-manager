# Use cases

## List jdks

    ~/.sjhm/jdks> ls
    jdk1
    jdk2
    jdk3

    ~/.sjhm/jdks> sjhm ls
    0 - jdk1
    1 - jdk2
    2 - jdk3
    
## Setting active jdk

    ~/.sjhm/jdks> sjhm ls
    0 - jdk1
    1 - jdk2
    2 - jdk3
    ~/> sjhm set 1

---

    ~/> echo $Env:JAVA_HOME
    ~/.sjhm/jdks/jdk2
