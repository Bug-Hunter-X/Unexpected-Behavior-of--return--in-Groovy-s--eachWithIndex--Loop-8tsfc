```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { item, index ->
    println "Item $index: $item"
    if (item == "stop") {
      return // This will only exit the eachWithIndex loop, not the method
    }
  }
  println "Method completed"
}

myMethod(["start", "continue", "stop", "end"])
```