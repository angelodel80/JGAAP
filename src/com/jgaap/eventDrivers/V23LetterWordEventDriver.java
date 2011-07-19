/*
 * JGAAP -- a graphical program for stylometric authorship attribution
 * Copyright (C) 2009,2011 by Patrick Juola
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/**
 **/
package com.jgaap.eventDrivers;

import com.jgaap.generics.Document;
import com.jgaap.generics.EventSet;

/**
 * Extract vowel-initial words with 2 or 3 letters as features
 * @author Patrick Juola
 * @since 4.1
 *
 */
/**
 * N.b use of _ to mark class name beginning with digit.
 */
public class V23LetterWordEventDriver extends MNLetterWordEventDriver {

    @Override
    public String displayName(){
    	return "Vowel 2--3 letter Words";
    }
    
    @Override
    public String tooltipText(){
    	return "Vowel-initial Words with 2 or 3 letters";
    }
    
    @Override
    public boolean showInGUI(){
    	return false;
    }

    private MNLetterWordEventDriver theDriver;

    @Override
    public EventSet createEventSet(Document ds) {
        theDriver = new MNLetterWordEventDriver();
        theDriver.setParameter("underlyingevents", "VowelInitialWordEventDriver");
        theDriver.setParameter("M", "2");
        theDriver.setParameter("N", "3");
        return theDriver.createEventSet(ds);
    }
}
