package io.riskscanner.controller;

import io.riskscanner.message.MessageDetail;
import io.riskscanner.service.NoticeService;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import java.util.List;

@ApiIgnore
@RestController
@RequestMapping("notice")
public class NoticeController {
    @Resource
    private NoticeService noticeService;

    @PostMapping("save/message/task")
    public void saveMessage(@RequestBody MessageDetail messageDetail) {
        noticeService.saveMessageTask(messageDetail);
    }

    @GetMapping("/search/message/type/{type}")
    public List<MessageDetail> searchMessage(@PathVariable String type) {
        return noticeService.searchMessageByType(type);
    }

    @GetMapping("/search/message/{resourceId}")
    public List<MessageDetail> searchMessageSchedule(@PathVariable String resourceId) {
        return noticeService.searchMessageByResourceId();
    }

    @GetMapping("/delete/message/{identification}")
    public int deleteMessage(@PathVariable String identification) {
        return noticeService.delMessage(identification);
    }
}

