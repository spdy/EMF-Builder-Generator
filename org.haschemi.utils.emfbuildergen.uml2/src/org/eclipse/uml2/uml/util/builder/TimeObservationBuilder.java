package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.TimeObservation</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class TimeObservationBuilder implements org.eclipse.uml2.uml.util.builder.IUmlBuilder<org.eclipse.uml2.uml.TimeObservation> {
  // features and builders
  private org.eclipse.uml2.uml.NamedElement m_event;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.NamedElement> m_featureEventBuilder;
  private Boolean m_firstEvent;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.TemplateParameter m_owningTemplateParameter;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter> m_featureOwningTemplateParameterBuilder;
  private org.eclipse.uml2.uml.TemplateParameter m_templateParameter;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter> m_featureTemplateParameterBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>>();
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>>();
  // helper attributes
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureEventSet = false;
  private boolean m_featureFirstEventSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureOwningTemplateParameterSet = false;
  private boolean m_featureTemplateParameterSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newTimeObservationBuilder()
   */
  private TimeObservationBuilder() {
  }

  /**
   * This method creates a new instance of the TimeObservationBuilder.
   * @return new instance of the TimeObservationBuilder
   */
  public static TimeObservationBuilder newTimeObservationBuilder() {
    return new TimeObservationBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public TimeObservationBuilder but() {
    TimeObservationBuilder _builder = newTimeObservationBuilder();
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureEventSet = m_featureEventSet;
    _builder.m_event = m_event;
    _builder.m_featureEventBuilder = m_featureEventBuilder;
    _builder.m_featureFirstEventSet = m_featureFirstEventSet;
    _builder.m_firstEvent = m_firstEvent;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureOwningTemplateParameterSet = m_featureOwningTemplateParameterSet;
    _builder.m_owningTemplateParameter = m_owningTemplateParameter;
    _builder.m_featureOwningTemplateParameterBuilder = m_featureOwningTemplateParameterBuilder;
    _builder.m_featureTemplateParameterSet = m_featureTemplateParameterSet;
    _builder.m_templateParameter = m_templateParameter;
    _builder.m_featureTemplateParameterBuilder = m_featureTemplateParameterBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.TimeObservation type.
   * @return new instance of the org.eclipse.uml2.uml.TimeObservation type
   */
  public org.eclipse.uml2.uml.TimeObservation build() {
    final org.eclipse.uml2.uml.TimeObservation _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createTimeObservation();
    if (m_featureEventSet) {
      _newInstance.setEvent(m_event);
    } else {
      if (m_featureEventBuilder != null) {
        _newInstance.setEvent(m_featureEventBuilder.build());
      }
    }
    if (m_featureFirstEventSet) {
      _newInstance.setFirstEvent(m_firstEvent);
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
    if (m_featureOwningTemplateParameterSet) {
      _newInstance.setOwningTemplateParameter(m_owningTemplateParameter);
    } else {
      if (m_featureOwningTemplateParameterBuilder != null) {
        _newInstance.setOwningTemplateParameter(m_featureOwningTemplateParameterBuilder.build());
      }
    }
    if (m_featureTemplateParameterSet) {
      _newInstance.setTemplateParameter(m_templateParameter);
    } else {
      if (m_featureTemplateParameterBuilder != null) {
        _newInstance.setTemplateParameter(m_featureTemplateParameterBuilder.build());
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
    if (m_featureEAnnotationsSet) {
      _newInstance.getEAnnotations().addAll(m_eAnnotations);
    } else {
      if (!m_featureEAnnotationsBuilder.isEmpty()) {
        for (org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> builder : m_featureEAnnotationsBuilder) {
          _newInstance.getEAnnotations().add(builder.build());
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

  public TimeObservationBuilder withEvent(org.eclipse.uml2.uml.NamedElement p_event) {
    m_event = p_event;
    m_featureEventSet = true;
    return this;
  }

  public TimeObservationBuilder withEvent(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.NamedElement> p_namedElementBuilder) {
    m_featureEventBuilder = p_namedElementBuilder;
    return this;
  }

  public TimeObservationBuilder withFirstEvent(Boolean p_firstEvent) {
    m_firstEvent = p_firstEvent;
    m_featureFirstEventSet = true;
    return this;
  }

  public TimeObservationBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public TimeObservationBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public TimeObservationBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public TimeObservationBuilder withOwningTemplateParameter(org.eclipse.uml2.uml.TemplateParameter p_owningTemplateParameter) {
    m_owningTemplateParameter = p_owningTemplateParameter;
    m_featureOwningTemplateParameterSet = true;
    return this;
  }

  public TimeObservationBuilder withOwningTemplateParameter(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter> p_templateParameterBuilder) {
    m_featureOwningTemplateParameterBuilder = p_templateParameterBuilder;
    return this;
  }

  public TimeObservationBuilder withTemplateParameter(org.eclipse.uml2.uml.TemplateParameter p_templateParameter) {
    m_templateParameter = p_templateParameter;
    m_featureTemplateParameterSet = true;
    return this;
  }

  public TimeObservationBuilder withTemplateParameter(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter> p_templateParameterBuilder) {
    m_featureTemplateParameterBuilder = p_templateParameterBuilder;
    return this;
  }

  public TimeObservationBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public TimeObservationBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public TimeObservationBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public TimeObservationBuilder withClientDependency(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency> p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public TimeObservationBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public TimeObservationBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public TimeObservationBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public TimeObservationBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public TimeObservationBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public TimeObservationBuilder withOwnedComment(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }
}
