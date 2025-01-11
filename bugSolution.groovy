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


def myMethodFixed(List<String> list) {
  list.eachWithIndex { item, index ->
    println "Item $index: $item"
    if (item == "stop") {
      return // This will only exit the eachWithIndex loop, not the method
    }
  }
  println "Method completed"
}

myMethodFixed(["start", "continue", "stop", "end"])


def myMethodFixedBreak(List<String> list) {
  for (int i = 0; i < list.size(); i++) {
    def item = list[i]
    println "Item $i: $item"
    if (item == "stop") {
      break
    }
  }
  println "Method completed"
}

myMethodFixedBreak(["start", "continue", "stop", "end"])
```