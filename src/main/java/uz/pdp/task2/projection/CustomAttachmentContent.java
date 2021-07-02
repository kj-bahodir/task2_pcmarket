package uz.pdp.task2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2.entity.Attachment;
import uz.pdp.task2.entity.AttachmentContent;

import javax.persistence.OneToOne;

@Projection(types = AttachmentContent.class)
public interface CustomAttachmentContent {

    Integer getId();
    byte[] getBytes();
    Integer getAttachment();

}
