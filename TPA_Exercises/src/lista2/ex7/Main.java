/**
toArray();
	Retorna um array de Object com a mesma quantidade de elementos da lista,
para isso basta tomar o iterador da lista e percorrer sobre todos os elementos 
adicionando-os no array de Object.

toArray(T[] a)
	Se o objeto ArrayList que chamou o método puder ser alocado inteiramente
dentro do array a passado então o próprio array a é preenchido com os elementos 
ficando com espaços vazios se for o caso de haver mais espaços que elementos na 
lista. Caso os elementos do objeto ArrayList excedam o tamanho do array passado 
a é então usado como protótipo para um array do tipo T com tamanho igual ao 
número de elementos do ArrayList. A implementação é semelhante a anterior mas 
primeiro se checa a quantidade de elementos da lista ser menor ou igual ao 
tamanho do vetor passado para definir se a criação de um novo vetor do tipo T é 
necessário.
*/
