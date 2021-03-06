/*******************************************************************************
 * Copyright (c) 2016 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.gemoc.xdsmlframework.ide.ui.xdsml.wizards.pages;

import org.eclipse.jface.util.BidiUtils;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

public class AskLanguageNameWizardPage extends WizardPage {

	public AskLanguageNameWizardPage(String pageName) {
		super(pageName);
		setPageComplete(false);
	}

	private Text _nameField;
    private String _initialLanguageName;
    private static final int SIZING_TEXT_FIELD_WIDTH = 250;

    public void setLanguageName(String name) {
        if (name == null) {
			_initialLanguageName = null;
		} else {
			int indexOfFirstPoint = name.lastIndexOf(".");
			String intermediateString = name.trim();
			if (indexOfFirstPoint != -1
				&& intermediateString.length() > indexOfFirstPoint) {
				intermediateString = intermediateString.substring(indexOfFirstPoint+1);
			}
	    	_initialLanguageName = intermediateString.replaceAll("\\W", "").replaceAll(" ", "");
        }
        if (_nameField != null) {
        	_nameField.setText(_initialLanguageName);
        }
    }
    
    public String getLanguageName() {
    	return _nameField.getText();
    }
    
    private boolean validatePage() {
    	boolean ok = false;
    	if (getLanguageName().length() > 2) {
    		ok = Character.isJavaIdentifierStart(getLanguageName().charAt(0));
    		for(char c : getLanguageName().substring(1).toCharArray())
        		ok = ok && Character.isJavaIdentifierPart(c);
    	}    	
    	return ok;    	
    }    
    
	@Override
	public void createControl(Composite parent) {
        // project specification group
        Composite composite = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.numColumns = 2;
        composite.setLayout(layout);
        composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        // new project label
        Label label = new Label(composite, SWT.NONE);
        label.setText("Language name");
        label.setFont(parent.getFont());

        // new project name entry field
        _nameField = new Text(composite, SWT.BORDER);
        GridData data = new GridData(GridData.FILL_HORIZONTAL);
        data.widthHint = SIZING_TEXT_FIELD_WIDTH;
        _nameField.setLayoutData(data);
        _nameField.setFont(parent.getFont());

        // Set the initial value first before listener
        // to avoid handling an event during the creation.
        if (_initialLanguageName != null) {
			_nameField.setText(_initialLanguageName);
		}
        _nameField.addListener(SWT.Modify, nameModifyListener);
        BidiUtils.applyBidiProcessing(_nameField, BidiUtils.BTD_DEFAULT);	
        setControl(composite);
	}

    private Listener nameModifyListener = new Listener() {
        public void handleEvent(Event e) {
        	//setLocationForSelection();
            boolean valid = validatePage();
            setPageComplete(valid);
                
        }
    };

}
