file:///C:/Users/marco/OneDrive/Escritorio/Tareas%20Universidad/Segundo%20año/Algoritmos%20y%20estructuras%20de%20datos/trabajos/java/hdt6/sort/src/main/java/pokemon/LinkedHash.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 15
uri: file:///C:/Users/marco/OneDrive/Escritorio/Tareas%20Universidad/Segundo%20año/Algoritmos%20y%20estructuras%20de%20datos/trabajos/java/hdt6/sort/src/main/java/pokemon/LinkedHash.java
text:
```scala
package pokemon@@
```



#### Error stacktrace:

```
scala.collection.Iterator$$anon$19.next(Iterator.scala:973)
	scala.collection.Iterator$$anon$19.next(Iterator.scala:971)
	scala.collection.mutable.MutationTracker$CheckedIterator.next(MutationTracker.scala:76)
	scala.collection.IterableOps.head(Iterable.scala:222)
	scala.collection.IterableOps.head$(Iterable.scala:222)
	scala.collection.AbstractIterable.head(Iterable.scala:935)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:164)
	dotty.tools.pc.MetalsDriver.run(MetalsDriver.scala:45)
	dotty.tools.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:32)
	dotty.tools.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:422)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator