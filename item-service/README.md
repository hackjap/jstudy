

### @ModelAttribute
### @PathVariable

### @RequestParam

### thymeleaf
- > th:onclick="|location.href='@{/basic/items/{itemId}(itemId=${item.id})}'|"
- th 속성시 기존의 html 태그보다 가장 먼저 우선순위로 등록 
- "순수 HTML을 그대로 유지하면서 뷰 템플릿도 사용할 수 있는 타임리프의 특징을 내츄럴 템플릿이라 한다."


### PRG : Post/Redirect/Get
- 저장 로직 컨트롤러에는 반드시 리다이렉트 시켜줘야 새로고침시에 저장 로직이 중복되는 것을 막을 수 있음 
- > return "redirect:/basic/items/" + item.getId();

### RedirectAttributes
- 사용자에게 저장이 되었는지 확인할 수 있는 요구사항
- Url Encoding 문제도 해결 


    @PostMapping("/add")
    public String addItemV6(Item item, RedirectAttributes redirectAttributes) {
        Item saveItem = itemRepository.save(item);
        redirectAttributes.addAttribute("itemId", saveItem.getId());
        redirectAttributes.addAttribute("status", true);
        return "redirect:/basic/items/{itemId}";
    }


