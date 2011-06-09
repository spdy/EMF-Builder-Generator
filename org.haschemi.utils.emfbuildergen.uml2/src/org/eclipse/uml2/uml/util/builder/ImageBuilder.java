package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.Image</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ImageBuilder {
  // features and builders
  private java.lang.String m_content;
  private java.lang.String m_format;
  private java.lang.String m_location;
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  // helper attributes
  private boolean m_featureContentSet = false;
  private boolean m_featureFormatSet = false;
  private boolean m_featureLocationSet = false;
  private boolean m_featureOwnedCommentSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newImageBuilder()
   */
  private ImageBuilder() {
  }

  /**
   * This method creates a new instance of the ImageBuilder.
   * @return new instance of the ImageBuilder
   */
  public static ImageBuilder newImageBuilder() {
    return new ImageBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ImageBuilder but() {
    ImageBuilder _builder = newImageBuilder();
    _builder.m_featureContentSet = m_featureContentSet;
    _builder.m_content = m_content;
    _builder.m_featureFormatSet = m_featureFormatSet;
    _builder.m_format = m_format;
    _builder.m_featureLocationSet = m_featureLocationSet;
    _builder.m_location = m_location;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.Image type.
   * @return new instance of the org.eclipse.uml2.uml.Image type
   */
  public org.eclipse.uml2.uml.Image build() {
    final org.eclipse.uml2.uml.Image _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createImage();
    if (m_featureContentSet) {
      _newInstance.setContent(m_content);
    }
    if (m_featureFormatSet) {
      _newInstance.setFormat(m_format);
    }
    if (m_featureLocationSet) {
      _newInstance.setLocation(m_location);
    }
    if (m_featureOwnedCommentSet) {
      _newInstance.getOwnedComments().addAll(m_ownedComment);
    } else {
      if (!m_featureOwnedCommentBuilder.isEmpty()) {
        for (CommentBuilder builder : m_featureOwnedCommentBuilder) {
          _newInstance.getOwnedComments().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public ImageBuilder withContent(java.lang.String p_content) {
    m_content = p_content;
    m_featureContentSet = true;
    return this;
  }

  public ImageBuilder withFormat(java.lang.String p_format) {
    m_format = p_format;
    m_featureFormatSet = true;
    return this;
  }

  public ImageBuilder withLocation(java.lang.String p_location) {
    m_location = p_location;
    m_featureLocationSet = true;
    return this;
  }

  public ImageBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ImageBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ImageBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }
}
