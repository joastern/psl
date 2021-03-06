/*
 * This file is part of the PSL software.
 * Copyright 2011-2015 University of Maryland
 * Copyright 2013-2015 The Regents of the University of California
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.umd.cs.psl.database;

import com.google.common.base.Preconditions;

import edu.umd.cs.psl.model.atom.GroundAtom;

/**
 * Identifier for a subset of {@link GroundAtom GroundAtoms} in a {@link DataStore}.
 */
public class Partition {

	private final int id;
	
	/**
	 * Sole constructor.
	 * 
	 * @param id  non-negative identifier
	 */
	public Partition(int id) {
		Preconditions.checkArgument(id>=0);
		this.id=id;
	}

	public int getID() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Partition["+id+"]";
	}
	
	@Override
	public int hashCode() {
		return id+211;
	}
	
	@Override
	public boolean equals(Object oth) {
		if (oth==this) return true;
		if (oth==null || !(oth instanceof Partition)) return false;
		return id == ((Partition)oth).id;  
	}
	
}
