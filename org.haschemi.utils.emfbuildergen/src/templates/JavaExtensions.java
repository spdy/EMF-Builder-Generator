/*******************************************************************************
 * Copyright (c) 2010 - 2010 Azmun project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Azmun project committers - initial API and implementation
 * Web: http://www.azmun.de
 * Contact : siamak AT haschemi.org
 *******************************************************************************/
package templates;

import java.util.List;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.uml2.codegen.ecore.Generator;

public class JavaExtensions {
  private static List<GenModel> s_genModels;

  public static String javaPackage(final String p_javaClass) {
    return p_javaClass.substring(0, p_javaClass.lastIndexOf("."));
  }

  public static void throwRuntimeException(final String p_message) {
    throw new RuntimeException(p_message);
  }

  public static final String safeSetterName(final EStructuralFeature p_structuralFeature) {
    return p_structuralFeature.getName().equals("class") ? p_structuralFeature.getName() + "_" : p_structuralFeature.getName();
  }

  public static final String safeName(final EStructuralFeature p_structuralFeature) {
    return CodeGenUtil.safeName(p_structuralFeature.getName());
  }

  public static String fqGenJavaPackage(final EClassifier p_eClassifier) {
    final GenPackage genPackage = findGenPackageFor(p_eClassifier);
    final StringBuilder sb = new StringBuilder();
    if (genPackage.getBasePackage() != null && genPackage.getBasePackage().trim().length() > 0) {
      sb.append(genPackage.getBasePackage());
      sb.append(".");
    }
    sb.append(genPackage.getEcorePackage().getName());
    return sb.toString();
  }

  public static String factoryInstance(final EClassifier p_eClassifier) {
    final GenPackage genPackage = findGenPackageFor(p_eClassifier);
    final StringBuilder sb = new StringBuilder();
    sb.append(genPackage.getFactoryName());
    sb.append(".");
    sb.append(genPackage.getFactoryInstanceName());
    return sb.toString();
  }

  public static String potentiallyPluralizedName(final EStructuralFeature p_structuralFeature) {
    final GenPackage genPackage = findGenPackageFor(p_structuralFeature.getEContainingClass());
    if (genPackage instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenPackage) {
      final org.eclipse.uml2.codegen.ecore.genmodel.GenPackage umlGenpackage = (org.eclipse.uml2.codegen.ecore.genmodel.GenPackage) genPackage;
      final org.eclipse.uml2.codegen.ecore.genmodel.GenModel umlGenModel = (org.eclipse.uml2.codegen.ecore.genmodel.GenModel) umlGenpackage.getGenModel();
      if (umlGenModel.isPluralizedGetters()) {
        return pluralize(p_structuralFeature.getName());
      }
    }
    return p_structuralFeature.getName();
  }

  private static String pluralize(final String name) {
    return Generator.pluralize(name);
  }

  private static final GenPackage findGenPackageFor(final EClassifier p_classifier) {
    for (final GenModel genModel : s_genModels) {
      for (final GenPackage genPackage : genModel.getGenPackages()) {
        if (ePackageEquals(p_classifier.getEPackage(), genPackage.getEcorePackage())) {
          return genPackage;
        }
      }
    }
    throw new RuntimeException("Did not find genpackage for '" + p_classifier + " using genmodel list " + s_genModels + ".");
  }

  private static boolean ePackageEquals(final EPackage p_this, final EPackage p_other) {
    return p_this.getName().equals(p_other.getName()) && p_this.getNsPrefix().equals(p_other.getNsPrefix()) && p_this.getNsURI().equals(p_other.getNsURI());
  }

  public static void setGenmodels(final List<GenModel> p_genModels) {
    s_genModels = p_genModels;
  }
}
