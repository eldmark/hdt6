file:///C:/Users/marco/OneDrive/Escritorio/Tareas%20Universidad/Segundo%20año/Algoritmos%20y%20estructuras%20de%20datos/trabajos/java/hdt6/sort/src/main/java/pokemon/FactoryMap.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 207
uri: file:///C:/Users/marco/OneDrive/Escritorio/Tareas%20Universidad/Segundo%20año/Algoritmos%20y%20estructuras%20de%20datos/trabajos/java/hdt6/sort/src/main/java/pokemon/FactoryMap.java
text:
```scala
package pokemon;
import java.util.*;

public class FactoryMap {
    public static Map<String, LinkedHashSet<String>> createMap(int option) {
        return switch (option) {
            case 1 -> new B@@Map<String>();
            case 2 -> new TreeMap<String, LinkedHashSet<String>>();
            case 3 -> new LinkedHashMap<String, LinkedHashSet<String>>();
            default -> throw new IllegalArgumentException("Opción inválida");
        };
    }
}


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
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:50)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:146)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator