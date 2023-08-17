package com.minatogithuborganization.appengineaug17one.base.model;
import com.vs.rappit.base.model.BaseModel;
import com.vs.rappit.base.annotations.Table;
import com.vs.rappit.base.annotations.Searchable;


@Table(name="Table123", keys={"sid"})
public class Table123Base extends BaseModel {

	@Searchable(index = true)
	private String field123;

	public void setField123(String field123) {
		this.field123 = field123;
	}

	public String getField123() {
		return field123;
	}



}