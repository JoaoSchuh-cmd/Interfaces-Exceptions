package models;

import java.io.Serializable;

public interface TakeExtract<Account extends Serializable> {
	default void takeExtract(Account c) {
		//MINHA CABE�A EXPLODIU AQUI
	}
}
