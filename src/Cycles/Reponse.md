# Ex. 5
**Redéfinir une méthode** signifie fournir une nouvelle implémentation d'une méthode héritée d'une classe parente dans une sous-classe.

# Ex. 6
Les méthodes redéfinies de `Velo` et `VeloElec` sont celles de la classe parente `Velo` qui sont adaptées dans la classe `VeloElec`.

# Ex. 7
L'annotation `@Override` indique que la méthode redéfinit une méthode de la classe parente et permet de vérifier la validité de la signature.

# Ex. 8
L'annotation `@Override` permet de détecter des erreurs liées à la redéfinition de méthode. On peut s’en dispenser, mais il est fortement recommandé de l'utiliser pour éviter les erreurs.

# Ex. 9
Annoter les méthodes pertinentes dans les deux classes avec `@Override`.

# Ex. 10
L’appel `super.getPuissance(FrequenceCoupsDePedale)` dans `VeloElec` appelle la méthode `getPuissance` de la classe parente `Velo`.

