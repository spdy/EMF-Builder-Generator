package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.StateInvariant</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class StateInvariantBuilder implements org.eclipse.uml2.uml.util.builder.IUmlBuilder<org.eclipse.uml2.uml.StateInvariant> {
  // features and builders
  private org.eclipse.uml2.uml.Interaction m_enclosingInteraction;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Interaction> m_featureEnclosingInteractionBuilder;
  private org.eclipse.uml2.uml.InteractionOperand m_enclosingOperand;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InteractionOperand> m_featureEnclosingOperandBuilder;
  private org.eclipse.uml2.uml.Constraint m_invariant;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> m_featureInvariantBuilder;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>>();
  private java.util.Collection<org.eclipse.uml2.uml.Lifeline> m_covered = new java.util.LinkedList<org.eclipse.uml2.uml.Lifeline>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Lifeline>> m_featureCoveredBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Lifeline>>();
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  private java.util.Collection<org.eclipse.uml2.uml.GeneralOrdering> m_generalOrdering = new java.util.LinkedList<org.eclipse.uml2.uml.GeneralOrdering>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.GeneralOrdering>> m_featureGeneralOrderingBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.GeneralOrdering>>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>>();
  // helper attributes
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureCoveredSet = false;
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureEnclosingInteractionSet = false;
  private boolean m_featureEnclosingOperandSet = false;
  private boolean m_featureGeneralOrderingSet = false;
  private boolean m_featureInvariantSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newStateInvariantBuilder()
   */
  private StateInvariantBuilder() {
  }

  /**
   * This method creates a new instance of the StateInvariantBuilder.
   * @return new instance of the StateInvariantBuilder
   */
  public static StateInvariantBuilder newStateInvariantBuilder() {
    return new StateInvariantBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public StateInvariantBuilder but() {
    StateInvariantBuilder _builder = newStateInvariantBuilder();
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureCoveredSet = m_featureCoveredSet;
    _builder.m_covered = m_covered;
    _builder.m_featureCoveredBuilder = m_featureCoveredBuilder;
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureEnclosingInteractionSet = m_featureEnclosingInteractionSet;
    _builder.m_enclosingInteraction = m_enclosingInteraction;
    _builder.m_featureEnclosingInteractionBuilder = m_featureEnclosingInteractionBuilder;
    _builder.m_featureEnclosingOperandSet = m_featureEnclosingOperandSet;
    _builder.m_enclosingOperand = m_enclosingOperand;
    _builder.m_featureEnclosingOperandBuilder = m_featureEnclosingOperandBuilder;
    _builder.m_featureGeneralOrderingSet = m_featureGeneralOrderingSet;
    _builder.m_generalOrdering = m_generalOrdering;
    _builder.m_featureGeneralOrderingBuilder = m_featureGeneralOrderingBuilder;
    _builder.m_featureInvariantSet = m_featureInvariantSet;
    _builder.m_invariant = m_invariant;
    _builder.m_featureInvariantBuilder = m_featureInvariantBuilder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.StateInvariant type.
   * @return new instance of the org.eclipse.uml2.uml.StateInvariant type
   */
  public org.eclipse.uml2.uml.StateInvariant build() {
    final org.eclipse.uml2.uml.StateInvariant _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createStateInvariant();
    if (m_featureEnclosingInteractionSet) {
      _newInstance.setEnclosingInteraction(m_enclosingInteraction);
    } else {
      if (m_featureEnclosingInteractionBuilder != null) {
        _newInstance.setEnclosingInteraction(m_featureEnclosingInteractionBuilder.build());
      }
    }
    if (m_featureEnclosingOperandSet) {
      _newInstance.setEnclosingOperand(m_enclosingOperand);
    } else {
      if (m_featureEnclosingOperandBuilder != null) {
        _newInstance.setEnclosingOperand(m_featureEnclosingOperandBuilder.build());
      }
    }
    if (m_featureInvariantSet) {
      _newInstance.setInvariant(m_invariant);
    } else {
      if (m_featureInvariantBuilder != null) {
        _newInstance.setInvariant(m_featureInvariantBuilder.build());
      }
    }
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureNameExpressionSet) {
      _newInstance.setNameExpression(m_nameExpression);
    } else {
      if (m_featureNameExpressionBuilder != null) {
        _newInstance.setNameExpression(m_featureNameExpressionBuilder.build());
      }
    }
    if (m_featureVisibilitySet) {
      _newInstance.setVisibility(m_visibility);
    }
    if (m_featureClientDependencySet) {
      _newInstance.getClientDependencies().addAll(m_clientDependency);
    } else {
      if (!m_featureClientDependencyBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency> builder : m_featureClientDependencyBuilder) {
          _newInstance.getClientDependencies().add(builder.build());
        }
      }
    }
    if (m_featureCoveredSet) {
      _newInstance.getCovereds().addAll(m_covered);
    } else {
      if (!m_featureCoveredBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Lifeline> builder : m_featureCoveredBuilder) {
          _newInstance.getCovereds().add(builder.build());
        }
      }
    }
    if (m_featureEAnnotationsSet) {
      _newInstance.getEAnnotations().addAll(m_eAnnotations);
    } else {
      if (!m_featureEAnnotationsBuilder.isEmpty()) {
        for (org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> builder : m_featureEAnnotationsBuilder) {
          _newInstance.getEAnnotations().add(builder.build());
        }
      }
    }
    if (m_featureGeneralOrderingSet) {
      _newInstance.getGeneralOrderings().addAll(m_generalOrdering);
    } else {
      if (!m_featureGeneralOrderingBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.GeneralOrdering> builder : m_featureGeneralOrderingBuilder) {
          _newInstance.getGeneralOrderings().add(builder.build());
        }
      }
    }
    if (m_featureOwnedCommentSet) {
      _newInstance.getOwnedComments().addAll(m_ownedComment);
    } else {
      if (!m_featureOwnedCommentBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> builder : m_featureOwnedCommentBuilder) {
          _newInstance.getOwnedComments().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public StateInvariantBuilder withEnclosingInteraction(org.eclipse.uml2.uml.Interaction p_enclosingInteraction) {
    m_enclosingInteraction = p_enclosingInteraction;
    m_featureEnclosingInteractionSet = true;
    return this;
  }

  public StateInvariantBuilder withEnclosingInteraction(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Interaction> p_interactionBuilder) {
    m_featureEnclosingInteractionBuilder = p_interactionBuilder;
    return this;
  }

  public StateInvariantBuilder withEnclosingOperand(org.eclipse.uml2.uml.InteractionOperand p_enclosingOperand) {
    m_enclosingOperand = p_enclosingOperand;
    m_featureEnclosingOperandSet = true;
    return this;
  }

  public StateInvariantBuilder withEnclosingOperand(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InteractionOperand> p_interactionOperandBuilder) {
    m_featureEnclosingOperandBuilder = p_interactionOperandBuilder;
    return this;
  }

  public StateInvariantBuilder withInvariant(org.eclipse.uml2.uml.Constraint p_invariant) {
    m_invariant = p_invariant;
    m_featureInvariantSet = true;
    return this;
  }

  public StateInvariantBuilder withInvariant(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> p_constraintBuilder) {
    m_featureInvariantBuilder = p_constraintBuilder;
    return this;
  }

  public StateInvariantBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public StateInvariantBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public StateInvariantBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public StateInvariantBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public StateInvariantBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public StateInvariantBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public StateInvariantBuilder withClientDependency(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency> p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public StateInvariantBuilder withCovered(org.eclipse.uml2.uml.Lifeline p_covered) {
    m_covered.add(p_covered);
    m_featureCoveredSet = true;
    return this;
  }

  public StateInvariantBuilder withCovered(java.util.Collection<? extends org.eclipse.uml2.uml.Lifeline> p_covered) {
    m_covered.addAll(p_covered);
    m_featureCoveredSet = true;
    return this;
  }

  public StateInvariantBuilder withCovered(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Lifeline> p_lifelineBuilder) {
    m_featureCoveredBuilder.add(p_lifelineBuilder);
    return this;
  }

  public StateInvariantBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public StateInvariantBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public StateInvariantBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public StateInvariantBuilder withGeneralOrdering(org.eclipse.uml2.uml.GeneralOrdering p_generalOrdering) {
    m_generalOrdering.add(p_generalOrdering);
    m_featureGeneralOrderingSet = true;
    return this;
  }

  public StateInvariantBuilder withGeneralOrdering(java.util.Collection<? extends org.eclipse.uml2.uml.GeneralOrdering> p_generalOrdering) {
    m_generalOrdering.addAll(p_generalOrdering);
    m_featureGeneralOrderingSet = true;
    return this;
  }

  public StateInvariantBuilder withGeneralOrdering(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.GeneralOrdering> p_generalOrderingBuilder) {
    m_featureGeneralOrderingBuilder.add(p_generalOrderingBuilder);
    return this;
  }

  public StateInvariantBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public StateInvariantBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public StateInvariantBuilder withOwnedComment(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }
}
