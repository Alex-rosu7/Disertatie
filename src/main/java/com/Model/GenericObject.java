package com.Model;

import org.springframework.data.domain.Persistable;

import java.io.Serializable;

public interface GenericObject extends Serializable, Persistable<String> {
}
